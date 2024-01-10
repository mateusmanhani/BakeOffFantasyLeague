
package bakeofffantasyleague;

import bakeofffantasyleague.Repositories.BakerRepository;

/**
 *
 * @author Mateus Manhani
 */
public class BakeOffFantasyLeague {

    public static void main(String[] args) {
        Baker joe = new Baker("Joe");
        BakerRepository.addBaker(joe);
        
        Baker jack = new Baker("Jack");
        BakerRepository.addBaker(jack);
        
        Baker julie = new Baker("Julie");
        BakerRepository.addBaker(julie);
        
        MenuSystem.showMenu();
    }
}
