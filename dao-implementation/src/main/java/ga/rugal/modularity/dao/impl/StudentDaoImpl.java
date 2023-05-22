package ga.rugal.modularity.dao.impl;

import ga.rugal.modularity.dao.StudentDao;
import ga.rugal.modularity.entity.Student;

/**
 * User DAO.
 *
 * @author Rugal Bernstein
 */
public class StudentDaoImpl implements StudentDao {

  @Override
  public Student get(final int id) {
    return new Student(id, "Rugal", 12);
  }
}
