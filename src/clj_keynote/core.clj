; 
(ns clj-keynote.core
  (:gen-class))



(defn repeat-chars "doc-string" [numb charc]
  (def s "")
  (doseq [nl (repeat numb charc)]
    (def s (str s nl))) 
  s)


(defn content "doc-string" []
  (str 
    (repeat-chars 30 "\n") 
    (repeat-chars 4 "\t") 
    (java.util.UUID/randomUUID)  
    (repeat-chars 30 "\n")))



(defn page "doc-string" []
  (let [yayinput (read-line)]
    (println (content))
    (page)))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ;; work around dangerous default behaviour in Clojure
  (alter-var-root #'*read-eval* (constantly false))
  (println (page)))
