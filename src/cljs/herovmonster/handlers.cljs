(ns herovmonster.handlers
    (:require [re-frame.core :as re-frame :refer [register-handler]]
              [herovmonster.db :as db]
              [herovmonster.data :as data]
              [herovmonster.utils :as utils]))

(register-handler
 :initialize-db
 (fn  [_ _]
   db/default-db))

(register-handler
 :begin-fight
 (fn [db [_ heroname]]
   (assoc db :monster (utils/mkmonster))))

(register-handler
 :update-heroname
 (fn [db [_ heroname]]
   (-> db
       (assoc :heroname heroname)
       (assoc :heroadj (data/randomheroadj)))))
