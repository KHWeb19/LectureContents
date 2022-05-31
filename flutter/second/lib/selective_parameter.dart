class Person {
  String name;
  int age;

  Person({ this.name = "", this.age = 0 });
}

selective_parameter_test() {
  Person p1 = Person(name: "아무개");
  Person p2 = Person(name: "아무개", age: 77);

  print("${p1.name}의 재산은 10000원, 나이는 ${p1.age}");
  print("${p2.name}의 재산은 10000원, 나이는 ${p2.age}");
}