module ru.test.mapper {
    exports ru.test.mapper;

    requires ru.test.model;
    requires ru.test.dto;
    requires ru.test.entity;

    requires static org.mapstruct;
    requires java.sql;
    requires java.compiler;
    requires spring.context;
}