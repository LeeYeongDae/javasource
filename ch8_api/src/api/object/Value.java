package api.object;

public class Value {
     int value;

     public Value() {
     }

     public Value(int value) {
          this.value = value;
     }

     @Override
     public int hashCode() {
          int hash = 7;
          return hash;
     }

     @Override
     public boolean equals(Object obj) {
          Value v = (Value) obj;

          return this.value == v.value;
     }

     @Override
     public String toString() {
          return "Value [value=" + value + "]";
     }
}
