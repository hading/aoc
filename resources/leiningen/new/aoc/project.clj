(defproject {{raw-name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [superstring "3.1.0"]
                 [tupelo "23.07.04"]
                 [ubergraph "0.8.2"]
                 [org.clojars.hading/had-utils "2.0.0"]]
  :repl-options {:init-ns {{namespace}}})