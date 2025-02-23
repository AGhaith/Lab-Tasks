public class Rectangle {
    public float length , width;
    Rectangle(){
        length = 0;
        width = 0;
    }
    Rectangle(float len, float wid){
        length = len;
        width = wid;
    }
    void setlength(float len){
        if (len > 0) {
            length = len;
        }
    }
    float getlength(){
        return length;
    }
    void setwidth (float wid){

        if (wid > 0) {
            width = wid;
        }
    }
    float getwidth(){
        return width;
    }
    float getArea(){
        return length*width;
    }
    float getPerimeter() {
        return length*2+width*2;
    }
}
