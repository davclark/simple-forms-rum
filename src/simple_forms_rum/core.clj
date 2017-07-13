(ns simple-forms-rum.core
  (:gen-class))

(require '[rum.core :as rum])

(rum/defc my-comp [s]
  [:div s])

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (rum/render-html (my-comp "hello")))
  ; (println "Hello, World!")
  )
