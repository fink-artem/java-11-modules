module ru.test.repository {
    exports ru.test.repository;

    requires net.bytebuddy;
    requires spring.data.commons;
    requires transitive ru.test.entity;
}