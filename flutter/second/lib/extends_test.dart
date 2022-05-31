class Person {
  String name;
  int age;

  Person({ this.name = "", this.age = 0 });
}

class Student extends Person {
  late String major;

  Student(name, age, major) : super(name: name, age: age) {
    this.major = major;
  }

  print_info () {
    print("이름: ${this.name}, 나이: ${this.age}, 전공: ${this.major}");
  }
}

extends_test() {
  Student student = Student("아무개", 77, "전기/전자")..print_info();
}