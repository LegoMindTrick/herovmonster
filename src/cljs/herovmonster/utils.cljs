(ns herovmonster.utils)

(defn monstertype [] (rand-nth ["ogre" "troll" "skrewt" "dragon" "lizard"]))

(defn adj [] (rand-nth ["brave" "stinky" "cowardly" "magnificent" "cool" "fat" "lazy" "weird" "dude" "reptillian"]))

(defn mkmonster [] {:strength (+ 1(rand-int 60))
                    :hp 5
                    :type (monstertype)
                    :adj (adj)})
