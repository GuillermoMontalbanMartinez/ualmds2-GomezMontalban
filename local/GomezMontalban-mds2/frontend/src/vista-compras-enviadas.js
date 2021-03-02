import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-listado-de-compras-enviadas.js';

class VistaComprasEnviadas extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;">
 <vaadin-horizontal-layout theme="spacing">
  <h1>Compras enviadas</h1>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="margin-top: var(--lumo-space-m);">
  <vaadin-button theme="primary">
   Compras enviadas
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="margin-top: var(--lumo-space-m);">
  <vaadin-button theme="primary" style="width: 104%; align-self: center;">
   Compras a enviar
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="padding-top: var(--lumo-space-xl);">
  <vista-listado-de-compras-enviadas></vista-listado-de-compras-enviadas>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-compras-enviadas';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaComprasEnviadas.is, VistaComprasEnviadas);
