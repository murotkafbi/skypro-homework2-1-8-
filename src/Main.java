public class    Main {
 public static void main(String[] args) {
  // Задача 1
  System.out.println("задача 1");
  var dog = 8.0;
  System.out.println(dog);
  var cat = 3.6;
  System.out.println(cat);
  var paper = 763789;
  System.out.println(paper);
  // задача 2
  System.out.println("Задача 2");
  dog = dog + 4;
  System.out.println(dog);
  cat = cat + 4;
  System.out.println(cat);
  paper = paper + 4;
  System.out.println(paper);
  // задача 3
  System.out.println("Задача 3");
  dog = dog - 3.5;
  System.out.println(dog);
  cat = cat - 1.6;
  System.out.println(cat);
  paper = paper - 7639;
  System.out.println(paper);
  //Задача 4
  System.out.println("зачада 4");
  var friend = 19;
  System.out.println(friend);
  friend = friend + 2;
  System.out.println(friend);
  friend = friend / 7; // friend/ =7
  System.out.println(friend);
  // Задача 5
  System.out.println("Задача 5");
  var frog = 3.5;
  System.out.println(frog);
  frog = frog * 10;
  System.out.println(frog);
  frog = frog / 3.5;
  System.out.println(frog);
  frog = frog + 4;
  System.out.println(frog);
  // Задача 6
  System.out.println("Задача 6");
  var bokser1 = 78.2;
  var bokser2 = 82.7;
  System.out.println("общий вес двух бойцов:" + (bokser1+bokser2));
  System.out.println("Разница весов дух бойцов:"+(bokser2-bokser1));
  //Задача 7
  System.out.println("Задача 7");
  System.out.println("общий вес двух бойцов (1 Способ):" + (bokser1+bokser2));
  System.out.println("Разница весов дух бойцов(2 Способ):"+(bokser2%bokser1));
  // Задача 8
  System.out.println("Задача 8");

  var hoursWork = 640;
  var timeWork = 8;
  var totalEmployees = hoursWork/timeWork;
  System.out.println("Всего работников в компании:" + totalEmployees + "человек");
  totalEmployees = totalEmployees+ 94;
  hoursWork = totalEmployees * timeWork;
  System.out.println("Если в копании рабтает:" + totalEmployees + "человек,то всего "+timeWork +"часов работы может быть поделено между сотрудниками");
 }
}
