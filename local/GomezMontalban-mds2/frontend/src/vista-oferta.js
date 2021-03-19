import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-mostrar-fecha-limite.js';

class VistaOferta extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout style="width: 90%; height: 100%; align-items: center; margin-right: var(--lumo-space-xl); margin-left: var(--lumo-space-xl);">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-self: center; justify-content: center;">
   <img style="width: 100%; height: 100%; align-self: center;">
  </vaadin-horizontal-layout>
  <vista-mostrar-fecha-limite style="height: 10%; width: 100%;"></vista-mostrar-fecha-limite>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-oferta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaOferta.is, VistaOferta);
