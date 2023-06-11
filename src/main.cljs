(ns main
  (:require [promesa.core :as p]
            ["node:fs/promises" :refer [readdir]]))


(p/let [dir (readdir "." {:recursive true})]
  (println dir))

