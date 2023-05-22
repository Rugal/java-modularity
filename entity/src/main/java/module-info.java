module ga.rugal.modularity.entity {
  requires lombok;
//  requires module.name; // compile & runtime
//  requires static A;    // compile, but optional on runtime
//  requires transitive module.name; // transitive to consumer

  exports ga.rugal.modularity.entity; // only this package will be usable to consumer
//  exports com.my.package.name to module1, module2; // only this package will be usable to listed module as consumer
}
