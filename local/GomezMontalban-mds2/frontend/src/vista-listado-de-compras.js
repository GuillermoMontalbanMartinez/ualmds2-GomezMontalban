import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-compras-admin.js';

class VistaListadoDeCompras extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="align-items: center; justify-content: center; width: 100%;" id="vaadinVerticalLayoutListadoDeCompras">
 <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center; width: 100%;">
  <h1>Listado de compras realizadas</h1>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; margin: var(--lumo-space-m); align-items: center; justify-content: center;">
  <vista-compras-admin></vista-compras-admin>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-listado-de-compras';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaListadoDeCompras.is, VistaListadoDeCompras);
