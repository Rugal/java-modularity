# Java Modularity tutorial

## compile

```shell
javac\
  --module-path ~/.m2/repository/org/projectlombok/lombok/1.18.24/lombok-1.18.24.jar\
  -d target/output/path\
  src/main/java/module-info.java src/main/java/ga/rugal/modularity/entity/Student.java
```

## run

### jar

```shell
java\
  --module-path\
  ~/.m2/repository/org/projectlombok/lombok/1.18.24/lombok-1.18.24.jar:entity/target/entity-1.0.0-SNAPSHOT.jar:dao/target/dao-1.0.0-SNAPSHOT.jar:dao-implementation/target/dao-implementation-1.0.0-SNAPSHOT.jar:main/target/main-1.0.0-SNAPSHOT.jar\
  --module
  ga.rugal.modularity.main/ga.rugal.modularity.Main
```

### class file

```shell
java\
  --module-path ~/.m2/repository/org/projectlombok/lombok/1.18.24/lombok-1.18.24.jar:entity/target/classes:dao/target/classes:dao-implementation/target/classes:main/target/classes\
  --module ga.rugal.modularity.main/ga.rugal.modularity.Main
```

### minimum JRE

```shell
jlink\
  --module-path\
  ~/.m2/repository/org/projectlombok/lombok/1.18.24/lombok-1.18.24.jar:`java_home -v 17`/jmod:./output\
  --output final\
  --add-modules\
  ga.rugal.modularity.main,ga.rugal.modularity.entity,ga.rugal.modularity.dao,ga.rugal.modularity.daoImplementation\
  --launcher\
  customjrelauncher=ga.rugal.modularity.main/ga.rugal.modularity.Main
```
