    package com.alura.forohub.controllers;

    import com.alura.forohub.dtos.TopicoDTO;
    import com.alura.forohub.entities.Curso;
    import com.alura.forohub.entities.Respuesta;
    import com.alura.forohub.entities.Topico;
    import com.alura.forohub.entities.Users;
    import com.alura.forohub.repositories.ICursoRepository;
    import com.alura.forohub.repositories.ITopicoRepository;
    import com.alura.forohub.repositories.IUserRepository;
    import com.alura.forohub.servicesintefaces.ITopicoService;
    import jakarta.validation.Valid;
    import org.modelmapper.ModelMapper;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

    import java.time.LocalDate;
    import java.util.List;
    import java.util.Optional;
    import java.util.stream.Collectors;

    @RestController
    @RequestMapping("/topicos")
    public class TopicoController {
        @Autowired
        private ITopicoService tS;

        @PostMapping
        public ResponseEntity<String> registrar(@RequestBody TopicoDTO dto) {
            ModelMapper m = new ModelMapper();
            Topico topico = m.map(dto, Topico.class);  // Convertir el DTO a entidad Topico

            // Si hay respuestas en el DTO, asignarlas al tópico
            if (dto.getRespuestas() != null && !dto.getRespuestas().isEmpty()) {
                List<Respuesta> respuestas = dto.getRespuestas().stream()
                        .map(respuestaDTO -> {
                            Respuesta respuesta = m.map(respuestaDTO, Respuesta.class);
                            respuesta.setTopico(topico);  // Asignar el tópico a la respuesta
                            return respuesta;
                        })
                        .collect(Collectors.toList());

                topico.setRespuestas(respuestas);  // Asignar las respuestas al tópico
            }

            tS.insert(topico);  // Guardar el tópico con sus respuestas
            return ResponseEntity.status(HttpStatus.CREATED).body("Tópico y respuestas creados con éxito");
        }


        @GetMapping
        public List<TopicoDTO> listar() {
            return tS.list().stream().map(x -> {
                ModelMapper m = new ModelMapper();
                return m.map(x, TopicoDTO.class);
            }).collect(Collectors.toList());
        }

        @PutMapping
        public ResponseEntity<String> modificar(@RequestBody TopicoDTO dto){
            ModelMapper m = new ModelMapper();
            Topico topico = m.map(dto, Topico.class);

            // Si hay respuestas en el DTO, actualizarlas
            if (dto.getRespuestas() != null && !dto.getRespuestas().isEmpty()) {
                List<Respuesta> respuestas = dto.getRespuestas().stream()
                        .map(respuestaDTO -> {
                            Respuesta respuesta = m.map(respuestaDTO, Respuesta.class);
                            respuesta.setTopico(topico);  // Asignar el tópico a la respuesta
                            return respuesta;
                        })
                        .collect(Collectors.toList());

                topico.setRespuestas(respuestas);  // Asignar las respuestas al tópico
            }

            tS.update(topico);  // Actualizar el tópico y sus respuestas
            return ResponseEntity.ok("Tópico y respuestas actualizados con éxito");
        }


        @DeleteMapping("/{id}")
        public void eliminar(@PathVariable("id") int id){
            tS.delete(id);
        }

        @GetMapping("/{id}")
        public TopicoDTO listarId(@PathVariable("id") int id) {
            ModelMapper m = new ModelMapper();
            TopicoDTO dto = m.map(tS.listarId(id), TopicoDTO.class);
            return dto;
        }
    }
