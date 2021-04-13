delete from instalaciones; 
INSERT INTO instalaciones (id_instalacion, nombre, precio, aforo, plazo_maximo_reserva, hora_maxima_reserva) VALUES (1,'Pista de tenis', 5, 10,30,4); 
INSERT INTO instalaciones (id_instalacion, nombre, precio, aforo, plazo_maximo_reserva, hora_maxima_reserva) VALUES (2,'Pista de pádel', 5, 10,30,4); 
INSERT INTO instalaciones (id_instalacion, nombre, precio, aforo, plazo_maximo_reserva, hora_maxima_reserva) VALUES (3,'Cancha de baloncesto', 5, 10,30,4); 
INSERT INTO instalaciones (id_instalacion, nombre, precio, aforo, plazo_maximo_reserva, hora_maxima_reserva) VALUES (4,'Campo de fútbol', 5, 10,30,4); 
INSERT INTO instalaciones (id_instalacion, nombre, precio, aforo, plazo_maximo_reserva, hora_maxima_reserva) VALUES (5,'Pista de fútbol sala', 5, 10,30,4);
INSERT INTO instalaciones (id_instalacion, nombre, precio, aforo, plazo_maximo_reserva, hora_maxima_reserva) VALUES (6,'Pista multideporte', 5, 10,30,4); 

delete from horarioActividad;
INSERT INTO horarioActividad(id_horario, id_actividad)
VALUES (1,1);

delete from actividades;
INSERT INTO actividades (id_actividad, id_instalacion, nombre, aforo, cuota_socio, cuota_no_socio, fechaInicioActividad, fechaFinActividad, id_inscripcion) VALUES (1,1,'Baloncesto', 50, 20, 25,'2019/03/14', '2021/03/23', 1); 


delete from socios;
INSERT INTO socios (id_socio, dni, nombre, apellidos,cuenta, telefono) VALUES (1,'12345678X','Ana', 'Perez Gomez','123456789IBAN', 123456789);

delete from noSocios;
INSERT INTO noSocios (id_noSocio,dni, nombre, apellidos) VALUES (1,'87654321X','Juan', 'Gomez Perez');

delete from inscripciones;
INSERT INTO inscripciones (id_inscripcion, nombre, fechaInicioSocios, fechaFinSocios, fechaFinNoSocios) VALUES (1, 'Primer cuatri','01/06/2019','01/07/2019','30/08/2019');

delete from horario;
INSERT INTO horario (id_horario,dia,hora_ini,hora_fin) VALUES (1, "Lunes", "13:00", "19:00");

delete from reservas;
INSERT INTO reservas (id_reserva, fechaIni, fechaFin, id_actividad, id_instalacion, hora_ini, hora_fin,id_socio) VALUES (1, "01/04/2021", "01/04/2021", 1, 1, "9:00", "10:00",1);
INSERT INTO reservas (id_reserva, fechaIni, fechaFin, id_actividad, id_instalacion, hora_ini, hora_fin,id_socio) VALUES (2, "01/03/2021", "01/04/2021", 1, 1, "9:00", "10:00",2);

delete from contabilidad;
INSERT INTO contabilidad (id_contabilidad, id_socio, importe, descripcion, pendiente, fecha) VALUES (1,1,10, 'reserva piscina', 'pagado', '22/04/2021');
INSERT INTO contabilidad (id_contabilidad, id_socio, importe, descripcion, pendiente, fecha) VALUES (2,1,25, 'reserva campo de futbol', 'pendiente', '15/04/2021');
INSERT INTO contabilidad (id_contabilidad, id_socio, importe, descripcion, pendiente, fecha) VALUES (3,2,20, 'reserva pista de baloncesto', 'pendiente', '30/04/2021');
INSERT INTO contabilidad (id_contabilidad, id_socio, importe, descripcion, pendiente, fecha) VALUES (4,3,15, 'reserva pista de tennis', 'pagado', '18/04/2021');




