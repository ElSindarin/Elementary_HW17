public class Main {

    public static void main(String[] args) {
        System.out.println("Собираемся на прогулку! Не забудьте одеть обувь, штаны, рубашку и, конечно же, головной убор!\n");
        WalkingPerson person = new WalkingPerson(false, false, true , true);
        //failure
        goForAWalk(person);
        person.setBootsOn(true);
        //failure
        goForAWalk(person);
        person.setHatOn(true);
        //success
        goForAWalk(person);
        person.setShirtOn(false);
        //failure
        goForAWalk(person);
    }

    public static void checkReadiness(WalkingPerson walkingPerson) throws IncompleteClothingException{
        if (walkingPerson.isBootsOn() && walkingPerson.isHatOn() && walkingPerson.isPantsOn() && walkingPerson.isShirtOn()) {
            System.out.println("Всё, что необходимо для выхода на улицу, одето! Выходим немедленно!");
        }
        else {
            throw new IncompleteClothingException("Нельзя выходить на улицу полураздетым! Проверьте, все ли необходимые элементы одежды надеты.");
        }
    }

    public static void goForAWalk (WalkingPerson walkingPerson) {
        try {
            checkReadiness(walkingPerson);
        } catch (IncompleteClothingException e) {
            System.out.println(e.getMessage() + " | Уникальный идентификатор ошибки: " + e.getUuid());
        }
        System.out.println();
    }
}
