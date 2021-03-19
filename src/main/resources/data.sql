delete from instalaciones; 
INSERT INTO instalaciones (nombre, precio, hora_apertura, hora_cierre, plazo_maximo_reserva, horas_maximas_reserva) VALUES ('Piscina', 5, '08:00', '22:00',30, 5); 
INSERT INTO instalaciones (nombre, precio, hora_apertura, hora_cierre, plazo_maximo_reserva, horas_maximas_reserva) VALUES ('Pista de Tenis', 7,'08:00','22:00', 30, 2); 
INSERT INTO instalaciones (nombre, precio, hora_apertura, hora_cierre, plazo_maximo_reserva, horas_maximas_reserva) VALUES ('Campo de Futbol', 10, '08:00', '22:00', 30, 4);
--INSERT INTO instalaciones (nombre, precio, hora_apertura, hora_cierre, plazo_maximo_reserva, horas_maximas_reserva) VALUES ('Campo de Golf', 10, '10:00', '20:00', 30, 2);

delete from actividades; 
INSERT INTO actividades (id_instalacion, nombre, aforo, cuota_socio, cuota_no_socio, fechaIniActividad, fechaFinActividad, id_inscripcion) VALUES (1,'Baloncesto', 50, 20, 25,'2019-04-01', '2019-04-30', 1); 
INSERT INTO actividades (id_instalacion, nombre, aforo, cuota_socio, cuota_no_socio, fechaIniActividad, fechaFinActividad, id_inscripcion) VALUES (2,'Balonmano', 25, 12, 15,'2019-04-05', '2019-04-25', 1); 
INSERT INTO actividades (id_instalacion, nombre, aforo, cuota_socio, cuota_no_socio, fechaIniActividad, fechaFinActividad, id_inscripcion) VALUES (2,'Tenis', 30, 10, 12,'2019-04-10', '2019-04-30', 1); 


delete from monitores;
INSERT INTO monitores (nombre, apellidos, dni, telefono) VALUES ('Pepe', 'Fernandez Rodriguez', '71727374A', '999999999'); 
INSERT INTO monitores (nombre, apellidos, dni, telefono) VALUES ('Marta', 'Gomez Perez', '12345678Z', '888888888'); 

delete from socios;
INSERT INTO socios (nombre, apellidos, dni,direccion, telefono, iban, correo,contrasena) VALUES ('Ana', 'Perez Gomez', '12345678X', 'Calle Ramon y Cajal', '987987987', 'ES1234567890123456789012', 'ana@gmail.com','asdf'); 
INSERT INTO socios (nombre, apellidos, dni,direccion, telefono, iban, correo,contrasena) VALUES ('Sergio', 'Alvarez Ruiz', '16545678X', 'Calle Uria', '987654321', null,'sergio@gmail.com','12345'); 

delete from noSocios;
INSERT INTO noSocios (nombre, apellidos, dni, direccion, telefono, tarjeta) VALUES ('Juan', 'Perez Valdes', '87654321D','Calle prueba', '456456456', null);
INSERT INTO noSocios (nombre, apellidos, dni, direccion, telefono, tarjeta) VALUES ('Carla', 'Arias Garcia', '75395146G','Avenida playa', '123123123', '8888777766665555');


delete from reservas; 
INSERT INTO reservas (id_instalacion, id_actividad, id_socio, fecha_inicioReserva, fecha_finReserva, hora_inicioReserva, hora_finReserva) VALUES  (1, null, 2, '2019-02-20', '2019-02-20', '11:00', '13:00'); 
INSERT INTO reservas (id_instalacion, id_actividad, id_socio, fecha_inicioReserva, fecha_finReserva, hora_inicioReserva, hora_finReserva) VALUES (2, 3, 1, '2019-04-25', '2019-04-25', '09:00', '11:00'); 
INSERT INTO reservas (id_instalacion, id_actividad, id_socio, fecha_inicioReserva, fecha_finReserva, hora_inicioReserva, hora_finReserva) VALUES (2, 3, 1, '2019-04-25', '2019-04-25', '13:00', '15:00'); 
INSERT INTO reservas (id_instalacion, id_actividad, id_socio, fecha_inicioReserva, fecha_finReserva, hora_inicioReserva, hora_finReserva) VALUES (2, 3, 1, '2019-04-04', '2019-04-04', '09:00', '11:00'); 


delete from listaEspera;
INSERT INTO listaEspera (id_instalacion, id_socio, id_noSocio, fechaInscripcion, horaInscripcion) VALUES (1, 1, null,'2019-03-05', '00:12');
INSERT INTO listaEspera (id_instalacion, id_socio, id_noSocio, fechaInscripcion, horaInscripcion) VALUES (1, null, 2,'2019-03-05', '00:52');

delete from inscripciones;
INSERT INTO inscripciones (etiqueta, fechaInicioSocios, fechaFinSocios, fechaFinNSocios) VALUES ('Verano','2019-06-01','2019-07-01','2019-08-30');

delete from contabilidad;
INSERT INTO contabilidad (usuario, importe, descripcion, pendiente, fecha) VALUES ('12345678X','40', 'reserva futbol', 'pagado', '2019-04-11');
INSERT INTO contabilidad (usuario, importe, descripcion, pendiente, fecha) VALUES ('12345678X','20', 'reserva tenis', 'pendiente', '2019-04-12');
INSERT INTO contabilidad (usuario, importe, descripcion, pendiente, fecha) VALUES ('12345678X','8', 'reserva piscina', 'pagado', '2019-04-22');

delete from ocupaciones;
INSERT INTO ocupaciones (id_instalacion,numero, horas, ingresos) VALUES (3,'2', '64', '1650'); 
INSERT INTO ocupaciones (id_instalacion,numero, horas, ingresos) VALUES (2,'3', '52', '1720');
INSERT INTO ocupaciones (id_instalacion,numero, horas, ingresos) VALUES (1,'6', '96', '2355');

delete from ocupaciones2;
INSERT INTO ocupaciones2 (id_instalacion,importe, horas) VALUES (3,'0', '10');
INSERT INTO ocupaciones2 (id_instalacion,importe, horas) VALUES (2,'42', '6');
INSERT INTO ocupaciones2 (id_instalacion,importe, horas) VALUES (1,'0', '4');
