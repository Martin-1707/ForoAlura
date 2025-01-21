# Forohub - API

Este proyecto es una API de ejemplo que maneja la creación, obtención y eliminación de "Tópicos". A continuación se describen los endpoints disponibles.

## Endpoints

### 1. **GET /topicos**
Obtiene todos los tópicos registrados.

**Descripción**: 
Este endpoint devuelve una lista de todos los tópicos disponibles en la base de datos.

**Respuesta**:
- **Código de estado**: 200 OK
- **Cuerpo**: Lista de objetos `TopicoDTO`

### 2. **GET /topicos/{id}**
Obtiene un tópico por su ID.

**Descripción**: 
Este endpoint devuelve un único tópico identificado por su `id`.

**Parámetros**:
- `id`: El ID del tópico que deseas obtener.

**Respuesta**:
- **Código de estado**: 200 OK (si el tópico existe)
- **Código de estado**: 404 Not Found (si el tópico no se encuentra)
- **Cuerpo**: Objeto `TopicoDTO`

### 3. **DELETE /topicos/{id}**
Elimina un tópico por su ID.

**Descripción**: 
Este endpoint elimina el tópico identificado por su `id`.

**
