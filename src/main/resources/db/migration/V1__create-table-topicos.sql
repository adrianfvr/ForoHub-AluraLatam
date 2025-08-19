create table topicos(
    id bigint not null auto_increment,
    titulo varchar(150) not null,
    mensaje varchar(255) not null,
    fecha_de_creacion date,
    status varchar(100),
    autor varchar(100),
    curso varchar(255),

    primary key(id)
);