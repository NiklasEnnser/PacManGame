package pacman;

public class PacMan {

    private int x, y, punkte, dir;
    private boolean lockMove;
    

    public PacMan() {
    }

    public PacMan(int x, int y, int punkte, int dir) {
        this.x = x;
        this.y = y;
        this.punkte = punkte;
        this.dir = dir;
    }

    public void kolision() {
        //System.out.println("x:" + x + "  y:" + y);
              if (dir == 2 && ( x > 30 && x < 155 && y < 40 && y > 30 || x > 20 && x < 150 &&  y < 310 && y > 210 || y < 80 && y > 60 && x > 180 && x < 290
                       || y > 180 && y < 190 && x > 220 && x < 480 || x > 550 && x < 670 && y > 30 && y < 40 || y < 80 && y > 60 && x > 395 && x < 530
                       || x > 545 && y < 220 && y > 210 || y > 280 && y < 290 && x > 230 && x < 470 || x < 150 && y > 360 && y < 380 || x > 550 && y < 370 && y > 360
                       || y > 520 && y < 530 && x < 310 && x > 160 || y > 520 && y < 530 && x < 540 && x > 390 || x < 80 && y > 595 && y < 610
                       || x > 630 && y > 595 && y < 610 || x > 100 && x < 250 && y > 635 && y < 650 || x > 440 && x < 595 && y > 640 && y < 650 || y > 650 && x > 300 && x < 400)){
            lockMove = true;
        }else if (dir == 1 && ( x > 30 && x < 40 && y < 125 && y > 30 || x > 170 && x < 180 && y < 160 && y > 60 || x > 0 && y < 120 && x > 310 && x < 340
                || y > 190 && y < 255 && x < 270 && x > 215 || x > 545 && x < 555 && y < 125 && y > 30 || y > 60 && y < 160 && x > 405 && x < 420
                || x > 545 && y < 355 && y > 215 || y > 285 && y < 435 && x > 235 && x < 250 || x > 545 && y < 515 && y > 365 
                || y > 515 && y < 595 && x > 160 && x < 170 || y > 525 && y < 595 && x < 420 && x > 390 || x > 625 && y > 595 && y < 675 || x > 100 && x < 120 && y > 640 && y < 735
                || x > 440 && x < 450 && y > 640 && y < 735 || y > 650 && x > 300 && x < 310)){
            lockMove = true;
        }else if (dir == 3 && ( x > 30 && x < 155 && y < 130 && y > 115 || x > 20 && x < 150 && y > 350 && y < 360 || y < 160 && y > 150 && x > 180 && x < 290
                       || y > 250 && y < 265 && x > 220 && x < 480 || x > 345 && x < 385 && y < 130 || x > 550 && x < 670 && y > 115 && y < 130 
                       || y > 140 && y < 160 && x > 395 && x < 530 || y > 430 && y < 440 && x > 230 && x < 470 || x > 550 && y < 355 && y > 340 || x > 545 && y < 520 && y > 365 
                       || x < 155 && y < 520 && y > 365 || y > 580 && y < 600 && x < 310 && x > 160 || y > 580 && y < 600 && x < 540 && x > 390 || x < 80 && y > 640 && y < 675
                       || x > 630 && y > 640 && y < 675 || x > 100 && x < 250 && y > 720 && y < 740 || x > 440 && x < 595 && y > 720 && y < 735)){
            lockMove = true;
        }else if (dir == 4 && ( x > 145 && x < 155 && y < 125 && y > 30 || x > 145 && x < 160 && y > 215 && y < 355 || x > 280 && x < 300 && y < 160 && y > 60
                    || x > 450 && x < 500 && y > 190 && y < 255 || y > 0 && y < 120 && x > 380 && x < 390 || x < 665 && x > 655 && y < 125 && y > 30 
                    || y > 60 && y < 160 && x > 510 && x < 530 || y > 285 && y < 435 && x > 450& x < 465 || x > 145 && x < 160 && y > 365 && y < 520
                    || y > 515 && y < 595 && x < 310 && x > 280 || y > 525 && y < 595 && x < 540 && x > 520 || x < 80 && y > 595 && y < 675 || x > 230 && x < 255 && y > 640 && y < 735
                    || x > 580 && x < 595 && y > 640 && y < 735 || y > 650 && x > 390 && x < 400)){
            lockMove = true;
        }else {
            lockMove = false;
        }
        
    }

    public void mover() {
        kolision();
        if (lockMove == false) {
            switch (dir) {
                case 1:
                    if (x < 670) {
                        x += 2;
                    }
                    break;
                case 2:
                    if (y < 750) {
                        y += 2;
                    }
                    break;
                case 3:
                    if (y > 25) {
                        y -= 2;
                    }
                    break;
                case 4:
                    if (x > 25) {
                        x -= 2;
                    }
                    break;
                default:
                    break;
            }
        }

    }

    public void stoppen() {
        
        System.exit(0);

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getPunkte() {
       
        return punkte;
    }
    
    public void setPunkte(int punkte) {
        this.punkte = punkte;
    }

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

}
