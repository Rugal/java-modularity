package ga.rugal.modularity;

import java.util.ServiceLoader;

import ga.rugal.modularity.dao.StudentDao;

/**
 * Main entrance class.
 *
 * @author Rugal Bernstein
 */
public class Main {

  /**
   * Main entrance.
   *
   * @param args command line arguments
   */
  public static void main(final String[] args) {
    final var load = ServiceLoader.load(StudentDao.class);
    final var s = load.findFirst().get().get(1);
    System.out.println(s);
  }
}
