class Dog {
  String name = "멍뭉이";
  int age = 5;
  String color = "white";
  int thirsty = 100;
}

print_dog() {
  Dog d1 = Dog();
  print("이름: ${d1.name}");
  print("나이: ${d1.age}");
  print("색상: ${d1.color}");
  print("목마름 지수: ${d1.thirsty}");
}