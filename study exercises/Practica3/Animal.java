package Practica3;

public class Animal {
    public int _age;
    public String _name;
    public String _specie;


    public Animal(int age, String name, String specie) {
        _age = age;
        _name = name;
        _specie = specie;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Animal) {
            Animal a = (Animal)o;
            if (a._age == (_age) && a._specie.equals(_specie)) {
                return true;
            }
        }
        return false;
    }

 /*   @Override
     public int hashCode() {
        HashCodeBuilder builder = new HashCodeBuilder();
               builder.append(_name);
               return builder.hashCode();
    } */
}
