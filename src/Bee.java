abstract class Bee implements IBehaviour{
   private float x,y;

    Bee(){
        x = 0;
        y = 0;
    }

    Bee(float x, float y){
        this.x = x;
        this.y = y;
    }

    float getX(){
        return x;
    }

    float getY(){
        return y;
    }
}
