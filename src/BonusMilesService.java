public class BonusMilesService {
        public int calculate (int cost) {
            int rubPerMile = 20;
            int bonus = cost / rubPerMile;
            return bonus;
        }
}
