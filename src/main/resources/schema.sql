--Primero se deben borrar todas las tablas (de detalle a maestro) y lugo anyadirlas (de maestro a detalle)
drop table instalaciones;
CREATE TABLE instalaciones (id_instalacion INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT NOT NULL, precio TEXT NOT NULL, aforoInst INTEGER NOT NULL);

drop table actividades;
CREATE TABLE actividades (id_actividad INTEGER PRIMARY KEY AUTOINCREMENT, id_instalacion INTEGER NOT NULL, nombre TEXT NOT NULL, 
aforo INTEGER NOT NULL, cuota_socio TEXT NOT NULL, cuota_no_socio TEXT NOT NULL,fechaInicioActividad TEXT NOT NULL, fechaFinActividad TEXT NOT NULL, id_inscripcion INTEGER, id_horario INTEGER,
FOREIGN KEY (id_instalacion) REFERENCES instalaciones(id_instalacion), 
FOREIGN KEY (id_inscripcion) REFERENCES inscripciones (id_inscripcion)
FOREIGN KEY (id_horario) REFERENCES horario (id_horario));

drop table socios;
CREATE TABLE socios(dni TEXT NOT NULL PRIMARY KEY, nombre TEXT NOT NULL, apellidos TEXT NOT NULL);


drop table noSocios;
CREATE TABLE noSocios(dni TEXT NOT NULL PRIMARY KEY, nombre TEXT NOT NULL, apellidos TEXT NOT NULL);


drop table inscripciones;
CREATE TABLE inscripciones (id_inscripcion INTEGER PRIMARY KEY AUTOINCREMENT, fechaInicioSocios TEXT NOT NULL, fechaFinSocios TEXT NOT NULL, 
fechaFinNoSocios TEXT NOT NULL);


drop table horario;
CREATE TABLE horario (id_horario INTEGER PRIMARY KEY AUTOINCREMENT, dia TEXT NOT NULL, hora_ini TEXT NOT NULL, hora_fin TEXT NOT NULL);

drop table reservas;
CREATE TABLE reservas (id_reserva INTEGER PRIMARY KEY AUTOINCREMENT, fechaIni TEXT NOT NULL, fechaFin TEXT NOT NULL, FOREING KEY (id_actividad) REFERENCES actividades (id_actividad));