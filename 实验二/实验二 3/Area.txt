public class Area
{
    double width;
    double height;
    double getRectArea()
    {
    double rectarea=width*height;
    return rectarea;
    }
    double above;
    double bottom;
    double getLaderArea()
    {
    return(above+bottom)*height/2;
    }
}