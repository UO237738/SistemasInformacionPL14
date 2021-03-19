delete from instalaciones; 
INSERT INTO instalaciones (id_instalacion, nombre, precio, aforo, plazo_maximo_reserva) VALUES (1,'Pista de tenis', 5, 10, 30); 
INSERT INTO instalaciones (id_instalacion, nombre, precio, aforo, plazo_maximo_reserva) VALUES (2,'Pista de pádel', 5, 10, 30); 
INSERT INTO instalaciones (id_instalacion, nombre, precio, aforo, plazo_maximo_reserva) VALUES (3,'Cancha de baloncesto', 5, 10, 30); 
INSERT INTO instalaciones (id_instalacion, nombre, precio, aforo, plazo_maximo_reserva) VALUES (4,'Campo de fútbol', 5, 10, 30); 
INSERT INTO instalaciones (id_instalacion, nombre, precio, aforo, plazo_maximo_reserva) VALUES (5,'Pista de fútbol sala', 5, 10, 30);
INSERT INTO instalaciones (id_instalacion, nombre, precio, aforo, plazo_maximo_reserva) VALUES (6,'Pista multideporte', 5, 10, 30); 

delete from actividades; 
INSERT INTO actividades (id_actividad, id_instalacion, nombre, aforo, cuota_socio, cuota_no_socio, fechaInicioActividad, fechaFinActividad, id_inscripcion, id_horario) VALUES (1,1,'Baloncesto', 50, 20, 25,'01/04/2019', '25/04/2021', 1, 1); 


delete from socios;
INSERT INTO socios (dni, nombre, apellidos) VALUES ('12345678X','Ana', 'Perez Gomez');
INSERT INTO socios (dni, nombre, apellidos) VALUES ('12345678Y','Pablo', 'Perez Lopez');

delete from noSocios;
INSERT INTO noSocios (dni, nombre, apellidos) VALUES ('87654321X','Juan', 'Gomez Perez');

delete from inscripciones;
INSERT INTO inscripciones (id_inscripcion, fechaInicioSocios, fechaFinSocios, fechaFinNoSocios) VALUES (1,'01/06/2019','01/07/2019','30/08/2019');

delete from horario;
INSERT INTO horario (id_horario,dia,hora_ini,hora_fin) VALUES (1, "Lunes", "13:00", "19:00");

delete from reservas;
INSERT INTO reservas (id_reserva, fechaIni, fechaFin, id_actividad, id_instalacion, hora_ini, hora_fin) VALUES (1, "01/04/2021", "01/04/2021", 1, 1, "9:00", "10:00");