package Task3;

  class Person implements Cloneable {
      private String name = "";

      public Person() {
          name = "";

      }

      public Person(String name) {
          this.name = name;
      }

      public void setName(String name) {
          this.name = name;
      }

      public String getName() {
          return name;
      }

      public String toString() {
          return this.name;
      }

      public boolean equals(Person p) {
          Person person = (Person) p;
          if (person.name == this.name)
              return true;
          return false;
      }

      public Object clone() throws CloneNotSupportedException {
          return super.clone();
      }

  }