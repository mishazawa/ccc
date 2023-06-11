(ns main
  (:require
   ["dotenv/config"]
   [promesa.core :as p]
   ["node:fs/promises" :refer [readdir]]
   [nbb.core :refer [await]]))

(defn asd []
  (p/let [dir (readdir "." {:recursive true})]
    dir))

(comment
  js/process.env.README
  (await (asd))
  nil)