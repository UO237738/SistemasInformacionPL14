--Primero se deben borrar todas las tablas (de detalle a maestro) y lugo anyadirlas (de maestro a detalle)
drop table instalaciones;
drop table socios;
drop table noSocios;
drop table inscripciones;
drop table horario;
drop table actividades;
drop table reservas;
drop table horarioActividad;
drop table contabilidad;


CREATE TABLE horarioActividad (
id_horario INTEGER,
id_actividad INTEGER,
PRIMARY KEY(
	id_horario,
	id_actividad));

CREATE TABLE instalaciones (
id_instalacion INTEGER PRIMARY KEY AUTOINCREMENT,
nombre TEXT NOT NULL,
precio TEXT NOT NULL,
aforo INTEGER NOT NULL,
plazo_maximo_reserva INTEGER NOT NULL,
hora_maxima_reserva INTEGER NOT NULL);


CREATE TABLE actividades (
id_actividad INTEGER PRIMARY KEY AUTOINCREMENT, 
id_instalacion INTEGER NOT NULL, nombre TEXT NOT NULL, 
aforo INTEGER NOT NULL, 
cuota_socio TEXT NOT NULL, 
cuota_no_socio TEXT NOT NULL,
fechaInicioActividad TEXT NOT NULL, 
fechaFinActividad TEXT NOT NULL, 
id_inscripcion INTEGER, 
FOREIGN KEY (id_instalacion) REFERENCES instalaciones(id_instalacion), 
FOREIGN KEY (id_inscripcion) REFERENCES inscripciones (id_inscripcion));


CREATE TABLE socios(
id_socio INTEGER PRIMARY KEY AUTOINCREMENT, 
dni TEXT NOT NULL, 
nombre TEXT NOT NULL, 
apellidos TEXT NOT NULL,
cuenta TEXT NOT NULL,
telefono INTEGER NOT NULL);



CREATE TABLE noSocios(
id_noSocio INTEGER PRIMARY KEY AUTOINCREMENT,
dni TEXT NOT NULL, 
nombre TEXT NOT NULL, 
apellidos TEXT NOT NULL);



CREATE TABLE inscripciones (
id_inscripcion INTEGER PRIMARY KEY AUTOINCREMENT,
nombre TEXT NOT NULL,
fechaInicioSocios TEXT NOT NULL, 
fechaFinSocios TEXT NOT NULL, 
fechaFinNoSocios TEXT NOT NULL);



CREATE TABLE horario (
id_horario INTEGER PRIMARY KEY AUTOINCREMENT, 
dia TEXT NOT NULL, 
hora_ini TEXT NOT NULL, 
hora_fin TEXT NOT NULL);


CREATE TABLE reservas (
id_reserva INTEGER PRIMARY KEY AUTOINCREMENT, 
fechaIni TEXT NOT NULL, 
fechaFin TEXT NOT NULL,
id_actividad INTEGER, 
id_instalacion INTEGER,
hora_ini TEXT NOT NULL,
hora_fin TEXT NOT NULL,
id_socio INTEGER,
FOREIGN KEY (id_actividad) REFERENCES actividades (id_actividad),
FOREIGN KEY (id_instalacion) REFERENCES instalaciones (id_instalacion),
FOREIGN KEY (id_socio) REFERENCES socios (id_socio));


CREATE TABLE contabilidad (
	id_contabilidad INTEGER PRIMARY KEY AUTOINCREMENT,
	id_socio INTEGER,
	importe INTEGER NOT NULL,
	descripcion TEXT NOT NULL,
	pendiente TEXT NOT NULL,
	fecha TEXT NOT NULL,
	FOREIGN KEY (id_socio) REFERENCES socios (id_socio)
	);