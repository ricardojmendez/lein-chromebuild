(defproject org.clojars.ricardojmendez/lein-chromebuild "0.3.2"
  :description "A leiningen plugin for building Chrome browser extensions."
  :url "https://github.com/clumsyjedi/lein-chromebuild"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true
  :dependencies [[lein-cljsbuild "1.1.4"]
                 [cljsbuild "1.1.4"]
                 [juxt/dirwatch  "0.2.3"]])
