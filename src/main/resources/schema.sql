--Primero se deben borrar todas las tablas (de detalle a maestro) y lugo anyadirlas (de maestro a detalle)
--(en este caso en cada una de las aplicaciones (tkrun y descuento) se usa solo una tabla, por lo que no hace falta)

--Para nuestro proyecto
drop table instalaciones;
CREATE TABLE instalaciones (id_instalacion INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT NOT NULL, precio TEXT NOT NULL, hora_apertura TEXT NOT NULL, 
hora_cierre TEXT NOT NULL, plazo_maximo_reserva INTEGER NOT NULL, horas_maximas_reserva INTEGER NOT NULL);

drop table actividades;
CREATE TABLE actividades (id_actividad INTEGER PRIMARY KEY AUTOINCREMENT, id_instalacion INTEGER NOT NULL, nombre TEXT NOT NULL, 
aforo INTEGER NOT NULL, cuota_socio TEXT NOT NULL, cuota_no_socio TEXT NOT NULL,fechaIniActividad TEXT NOT NULL, fechaFinActividad TEXT NOT NULL, id_inscripcion INTEGER,
FOREIGN KEY (id_instalacion) REFERENCES instalaciones(id_instalacion), 
FOREIGN KEY (id_inscripcion) REFERENCES inscripciones (id_inscripcion));

drop table monitores;
CREATE TABLE monitores (id_monitor INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT NOT NULL, apellidos TEXT NOT NULL, dni TEXT NOT NULL, telefono TEXT NOT NULL);

drop table socios;
CREATE TABLE socios(id_socio INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT NOT NULL, apellidos TEXT NOT NULL, dni TEXT NOT NULL, 
direccion TEXT NOT NULL, telefono TEXT NOT NULL, iban TEXT, correo TEXT NOT NULL, contrasena TEXT NOT NULL);


drop table noSocios;
CREATE TABLE noSocios (id_noSocio INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT NOT NULL, apellidos TEXT NOT NULL, dni TEXT NOT NULL, 
direccion TEXT NOT NULL, telefono TEXT NOT NULL, tarjeta TEXT);


drop table reservas;
CREATE TABLE reservas (id_reserva INTEGER PRIMARY KEY AUTOINCREMENT, id_instalacion INTEGER NOT NULL, id_actividad INTEGER, 
id_socio INTEGER NOT NULL, fecha_inicioReserva TEXT NOT NULL, fecha_finReserva TEXT NOT NULL, hora_inicioReserva TEXT NOT NULL, hora_finReserva TEXT NOT NULL, 
FOREIGN KEY (id_instalacion) REFERENCES instalaciones (id_instalacion), 
FOREIGN KEY (id_actividad) REFERENCES actividades (id_actividad), 
FOREIGN KEY (id_socio) REFERENCES socios(id_socio));

drop table listaEspera;
CREATE TABLE listaEspera (id_espera INTEGER PRIMARY KEY AUTOINCREMENT, id_instalacion INTEGER NOT NULL, id_socio INTEGER, id_noSocio INTEGER, 
fechaInscripcion TEXT NOT NULL, horaInscripcion TEXT NOT NULL, 
FOREIGN KEY (id_instalacion) REFERENCES instalaciones (id_instalacion),
FOREIGN KEY (id_socio) REFERENCES socios(id_socio), 
FOREIGN KEY (id_noSocio) REFERENCES noSocios (id_noSocio));

drop table inscripciones;
CREATE TABLE inscripciones (id_inscripcion INTEGER PRIMARY KEY AUTOINCREMENT,etiqueta TEXT NOT NULL, fechaInicioSocios TEXT NOT NULL, fechaFinSocios TEXT NOT NULL, 
fechaFinNSocios TEXT NOT NULL);

drop table inscritos;
CREATE TABLE inscritos (id_inscrito INTEGER PRIMARY KEY AUTOINCREMENT,id_inscripcion INTEGER NOT NULL,id_actividad INTEGER NOT NULL, id_socio INTEGER, id_noSocio INTEGER,
FOREIGN KEY (id_actividad) REFERENCES actividades(id_actividad),
FOREIGN KEY (id_inscripcion) REFERENCES inscripciones(id_inscripcion),
FOREIGN KEY (id_socio) REFERENCES socios (id_socio), 
FOREIGN KEY (id_noSocio) REFERENCES noSocios (id_noSocio));

drop table usuarios;
CREATE TABLE usuarios (id_usuario INTEGER PRIMARY KEY AUTOINCREMENT, id_actividad INTEGER NOT NULL,id_socio INTEGER, id_noSocio INTEGER,
FOREIGN KEY (id_actividad) REFERENCES actividades (id_actividad), 
FOREIGN KEY (id_socio) REFERENCES socios (id_socio), 
FOREIGN KEY (id_noSocio) REFERENCES noSocios (id_noSocio));

drop table horario;
CREATE TABLE horario (id_horario INTEGER PRIMARY KEY AUTOINCREMENT,id_actividad INTEGER NOT NULL, dia TEXT NOT NULL, horaInicio TEXT NOT NULL, horaFin TEXT NOT NULL,
FOREIGN KEY (id_actividad) REFERENCES actividades (id_actividad));

drop table ocupaciones;
CREATE TABLE ocupaciones (id_ocupacion INTEGER PRIMARY KEY AUTOINCREMENT, id_instalacion INTEGER NOT NULL,numero TEXT NOT NULL, horas TEXT NOT NULL, ingresos TEXT NOT NULL);

drop table ocupaciones2;
CREATE table ocupaciones2 (id_ocupaciones2 INTEGER PRIMARY KEY AUTOINCREMENT, id_instalacion INTEGER NOT NULL,importe TEXT NOT NULL, horas TEXT NOT NULL);

drop table contabilidad;
CREATE TABLE contabilidad (id_contabilidad INTEGER PRIMARY KEY AUTOINCREMENT,usuario TEXT NOT NULL, importe TEXT NOT NULL, descripcion TEXT NOT NULL, pendiente TEXT NOT NULL, fecha TEXT NOT NULL);

