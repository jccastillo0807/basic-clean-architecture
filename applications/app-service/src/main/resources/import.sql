--TABLA LIBROS
INSERT INTO t_libros (editorial, isbn, nombre, nro_paginas) VALUES ('norma', '1234', 'Mil y una noches', '345');
INSERT INTO t_libros (editorial, isbn, nombre, nro_paginas) VALUES ('editorial_test_1', '1001', 'Mil y una noches', '123');
INSERT INTO t_libros (editorial, isbn, nombre, nro_paginas) VALUES ('editorial_test_2', '1002', 'Cien años de soledad', '542');
INSERT INTO t_libros (editorial, isbn, nombre, nro_paginas) VALUES ('editorial_test_3', '1003', 'La rebelion de las ratas', '800');
INSERT INTO t_libros (editorial, isbn, nombre, nro_paginas) VALUES ('editorial_test_5', '1004', 'El patron del mal', '855');
INSERT INTO t_libros (editorial, isbn, nombre, nro_paginas) VALUES ('editorial_test_6', '1005', 'Juego de tronos', '1554');
INSERT INTO t_libros (editorial, isbn, nombre, nro_paginas) VALUES ('editorial_test_4', '1006', 'Harry potter', '254');
INSERT INTO t_libros (editorial, isbn, nombre, nro_paginas) VALUES ('editorial_test_7', '1007', 'Java editorial 1', '1006');

--TABLA AUTOR
INSERT INTO t_autores (nombre) VALUES ('Antonio Graham');
INSERT INTO t_autores (nombre) VALUES ('Gabriel Garcia marquez');
INSERT INTO t_autores (nombre) VALUES ('Pedro Parama');
INSERT INTO t_autores (nombre) VALUES ('Josehp Imuez');
INSERT INTO t_autores (nombre) VALUES ('Gandlag Achim');
INSERT INTO t_autores (nombre) VALUES ('Harry Kane');
INSERT INTO t_autores (nombre) VALUES ('Vinicius Jr');

--TABLA USUARIOS
INSERT INTO usuarios (direccion, nombre, numero_identificacion, telefono, tipo_identificacion) VALUES ('Cll 1 Nro 1-2', 'jjcarrillo', '123456', '3216549887', 'CC');
INSERT INTO usuarios (direccion, nombre, numero_identificacion, telefono, tipo_identificacion) VALUES ('Cll 2 Nro 2-2', 'rflorez', '234567', '312345678', 'TI');
INSERT INTO usuarios (direccion, nombre, numero_identificacion, telefono, tipo_identificacion) VALUES ('Cll 3 Nro 3-2', 'pgiraldo', '345678', '311567890', 'CC');
INSERT INTO usuarios (direccion, nombre, numero_identificacion, telefono, tipo_identificacion) VALUES ('Cll 4 Nro 4-2', 'bpalacios', '456789', '3456789012', 'PA');
INSERT INTO usuarios (direccion, nombre, numero_identificacion, telefono, tipo_identificacion) VALUES ('Cll 5 Nro 5-2', 'jdzapata', '567890', '3109876543', 'NIT');
INSERT INTO usuarios (direccion, nombre, numero_identificacion, telefono, tipo_identificacion) VALUES ('Cll 6 Nro 6-2', 'amunoz', '678900', '3009876543', 'CC');
