module ru.test.repository {
    exports ru.test.repository;

    requires spring.data.commons;
    requires transitive ru.test.entity;
}