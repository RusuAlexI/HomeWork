
package exercise.point.circle.triangle;


public class MyPoint {
private int x=0;
private int y=0;

public MyPoint(){
}

public MyPoint(int x, int y){
this.x=x;
this.y=y;
}

public int getX(){
return this.x;
}

public void setX(int x){
this.x=x;
}
public int getY(){
return this.y;
}

public void setY(int y){
this.y=y;
}

public int[] getXY(){
int[] xy=new int[2]; 
xy[0]=this.x;
xy[1]=this.y;
return xy;
}

public void setXY(int x, int y){
this.x=x;
this.y=y;
}

@Override
public String toString(){
    return "("+this.x+","+this.y+")";
}

public double distance(int x, int y){
return Math.sqrt(((this.x-x)*(this.x-x))+((this.y-y)*(this.y-y)));
}

public double distance(MyPoint another){
return Math.sqrt(((this.x-another.x)*(this.x-another.x))+((this.y-another.y)*(this.y-another.y)));
}


public double distance(){
return Math.sqrt(((this.x-0)*(this.x-0))+((this.y-0)*(this.y-0)));
}

}
