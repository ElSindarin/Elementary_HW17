public class WalkingPerson {
   private boolean isBootsOn;
   private boolean isHatOn;
   private boolean isPantsOn;
   private boolean isShirtOn;

    public WalkingPerson(boolean isBootsOn, boolean isHatOn, boolean isPantsOn, boolean isShirtOn) {
        this.isBootsOn = isBootsOn;
        this.isHatOn = isHatOn;
        this.isPantsOn = isPantsOn;
        this.isShirtOn = isShirtOn;
    }

    public boolean isBootsOn() {
        return isBootsOn;
    }

    public void setBootsOn(boolean bootsOn) {
        isBootsOn = bootsOn;
    }

    public boolean isHatOn() {
        return isHatOn;
    }

    public void setHatOn(boolean hatOn) {
        isHatOn = hatOn;
    }

    public boolean isPantsOn() {
        return isPantsOn;
    }

    public void setPantsOn(boolean pantsOn) {
        isPantsOn = pantsOn;
    }

    public boolean isShirtOn() {
        return isShirtOn;
    }

    public void setShirtOn(boolean shirtOn) {
        isShirtOn = shirtOn;
    }

    public void putBoots () {
        System.out.println("Обувь надета.");
        this.isBootsOn = true;
    }

    public void putHat () {
        System.out.println("Головной убор надет.");
        this.isHatOn = true;
    }

    public void putPants () {
        System.out.println("Штаны надеты.");
        this.isPantsOn = true;
    }

    public void putShirt () {
        System.out.println("Рубашка надета.");
        this.isShirtOn = true;
    }


}
