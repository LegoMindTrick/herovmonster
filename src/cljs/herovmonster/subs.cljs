(ns herovmonster.subs
    (:require-macros [reagent.ratom :refer [reaction]])
    (:require [re-frame.core :as re-frame :refer [register-sub]]))

(register-sub
 :name
 (fn [db]
   (reaction (:name @db))))

(register-sub
 :heroname
 (fn [db]
   (reaction (:heroname @db))))

(register-sub
 :heroadj
 (fn [db]
   (reaction (:heroadj @db))))

(register-sub
 :monster
 (fn [db]
   (reaction (:monster @db))))
