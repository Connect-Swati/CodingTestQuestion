public class Cycle {
/*high level
components -
1. frame
2. handle bar with brakes
3. seating,
4. wheels,
5. chain assembly*/
/*
* a wheel has spokes, rim, tube,
tyre.*/

        int id;

        String date;

        /*components - 1. frame*/
        String frame;

        /*components - 2. handle bar with brakes*/
        String handlebar;

        /* componenet 3: wheels*/
        String wheels;
         //parts of wheels
        int spokes;

        int rim;

        int tube;

        int gear;

        /*component 4: seating */
        int seating;

        String tyre;
        /*componenet 5: chaining */
    int chain;

    public int getChain() {
        return chain;
    }

    public void setChain(int chain) {
        this.chain = chain;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getHandlebar() {
        return handlebar;
    }

    public void setHandlebar(String handlebar) {
        this.handlebar = handlebar;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public int getSpokes() {
        return spokes;
    }

    public void setSpokes(int spokes) {
        this.spokes = spokes;
    }

    public int getRim() {
        return rim;
    }

    public void setRim(int rim) {
        this.rim = rim;
    }

    public int getTube() {
        return tube;
    }

    public void setTube(int tube) {
        this.tube = tube;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSeating() {
        return seating;
    }

    public void setSeating(int seating) {
        this.seating = seating;
    }

    public String getTyre() {
        return tyre;
    }

    public void setTyre(String tyre) {
        this.tyre = tyre;
    }

    @Override
    public String toString() {
        return "Cycle{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", frame='" + frame + '\'' +
                ", handlebar='" + handlebar + '\'' +
                ", wheels='" + wheels + '\'' +
                ", spokes=" + spokes +
                ", rim=" + rim +
                ", tube=" + tube +
                ", seating=" + seating +
                ", tyre='" + tyre + '\'' +
                '}';
    }

    public ToReturnValue calculatePrice()
        {
            String[] arr= this.date.split( "-" );
            int month = Integer.valueOf( arr[0] );
            int year = Integer.valueOf( arr[1] );
            int tyreprice=0;
            if(month>=1 && month<=11 && year==2016) {
                tyreprice = 200;
            }else {
                tyreprice= 230;
            }

            int framePrice = 0;
            if(this.frame.equals( "steel" )) {
                framePrice = 250;
            } else if(frame.equals( "Aluminium" )) {
                framePrice = 100;
            }

            int handlebarPrice=0;
            if(this.handlebar.equals( "smooth" )) {
                handlebarPrice = 200  ;
            }else {
                handlebarPrice = 100 ;
            }

            int wheelerPrice=0;
            if(this.wheels.equals("steel"  )) {
                wheelerPrice =  spokes + rim + tyreprice +100+ tube;
            } else if(wheels.equals( "Aluminium" )) {
                wheelerPrice =  spokes + rim + tyreprice + 200 + tube;
            }
    int seatingPrice=0;
            if(seating==2)
            {
                seatingPrice=framePrice*2;
            }
            else
            {
                seatingPrice=framePrice*1;
            }
            int chainprice=0 ;
            if(this.chain==1) {
                chainprice = 100;
            } else if(chain==2) {
                chainprice = 200;
            }

            int totalcyclePrice = tyreprice+framePrice + handlebarPrice +seatingPrice+ chainprice+wheelerPrice ;
            ToReturnValue obj = new ToReturnValue();
            obj.dateOfPurchasingOfTyre=date;
             obj.tyrePrice=tyreprice;
            obj.framePrice=framePrice;
            obj.handlebarPrice=handlebarPrice;
            obj.wheelerPrice=wheelerPrice;
            obj.seatingPrice=seatingPrice;
            obj.chainprice=chainprice;
            obj.totalcyclePrice=totalcyclePrice;
            return obj;
           

        }
    }

