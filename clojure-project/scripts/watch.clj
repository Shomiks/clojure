(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'clojure-project.core
   :output-to "out/clojure_project.js"
   :output-dir "out"})
