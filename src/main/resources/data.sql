delete from instalaciones; 
INSERT INTO instalaciones (id_instalacion, nombre, precio, aforo) VALUES (1,'Pista de tenis', 5, 10); 

delete from actividades; 
INSERT INTO actividades (id_actividad, id_instalacion, nombre, aforo, cuota_socio, cuota_no_socio, fechaInicioActividad, fechaFinActividad, id_inscripcion, id_horario) VALUES (1,1,'Baloncesto', 50, 20, 25,'2019-04-01', '2019-04-30', 1, 1); 

delete from socios;
INSERT INTO socios (dni, nombre, apellidos) VALUES ('12345678X','Ana', 'Perez Gomez');

delete from noSocios;
INSERT INTO noSocios (dni, nombre, apellidos) VALUES ('87654321X','Juan', 'Gomez Perez');

delete from inscripciones;
INSERT INTO inscripciones (id_inscripciones, fechaInicioSocios, fechaFinSocios, fechaFinNoSocios) VALUES ('1','2019-06-01','2019-07-01','2019-08-30');

delete from horario;
INSERT INTO horario (id_horario,dia,hora_ini,hora_fin) VALUES (1, "Lunes", "13:00", "19:30");

delete from reservas;
INSERT INTO reservas (id_reservas, fechaIni, fechaFin, id_actividad) VALUES (1, "9:00", "10:00", 1);