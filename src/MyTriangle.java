/**
 * Created by Lizzi on 14.11.2016.
 */
public class MyTriangle {

        private MyPoint v1 = new MyPoint();
        private MyPoint v2 = new MyPoint();
        private MyPoint v3 = new MyPoint();

        MyTriangle() {
            this.v1.setXY(0, 0);
            this.v2.setXY(0, 0);
            this.v3.setXY(0, 0);
        }

        MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
            this.v1.setXY(x1, y1);
            this.v2.setXY(x2, y2);
            this.v3.setXY(x3, y3);
        }

        @Override
        public boolean equals(Object o) {

            if (!(o instanceof MyTriangle)) return false;

            MyTriangle that = (MyTriangle) o;

            if ((v1.equals(that.v1))&&(v2.equals(that.v2))&&(v3.equals(that.v3)))
                return true;
            else return false;

        }

        @Override
        public int hashCode() {
            int result = v1 != null ? v1.hashCode() : 0;
            result = 31 * result + (v2 != null ? v2.hashCode() : 0);
            result = 31 * result + (v3 != null ? v3.hashCode() : 0);
            return result;
        }

        MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
            this.v1 = v1;
            this.v2 = v2;
            this.v3 = v3;
        }

        public String toString() {
            return "MyTriangle{v1=" + this.v1.toString() + ", v2=" + this.v2.toString() + ", v3=" + this.v3.toString() + '}';
        }

        public double getPerimeter() {
            return this.v1.distance(this.v2) + this.v2.distance(this.v3) + this.v3.distance(this.v1);
        }

        public String getType() {
            double a = this.v1.distance(this.v2);
            double b = this.v2.distance(this.v3);
            double c = this.v3.distance(this.v1);
            String type;
            if(a == b && b == c && c == a) {
                type = "equilateral";
            } else if(a != b && b != c && c != a) {
                type = "scalene";
            } else {
                type = "isosceles";
            }

            return type;
        }
    }


