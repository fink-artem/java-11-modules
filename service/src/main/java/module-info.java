module ru.test.service {
    exports ru.test.service;

    requires ru.test.repository;
    requires transitive ru.test.model;
    requires ru.test.mapper;

    requires spring.context;
    requires lombok;

}