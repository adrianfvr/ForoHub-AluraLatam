create table topicos(
    id bigint not null auto_increment,
    titulo varchar(150) not null,
    mensaje varchar(255) not null,
    fecha_de_creacion
    primary key(id);
);