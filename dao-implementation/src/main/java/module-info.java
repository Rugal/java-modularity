module ga.rugal.modularity.daoImplementation {
  requires ga.rugal.modularity.entity;
  requires ga.rugal.modularity.dao;

  provides ga.rugal.modularity.dao.StudentDao with ga.rugal.modularity.dao.impl.StudentDaoImpl;
}
