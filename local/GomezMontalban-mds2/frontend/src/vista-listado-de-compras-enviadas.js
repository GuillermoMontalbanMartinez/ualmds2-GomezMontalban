import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaListadoDeComprasEnviadas extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="align-items: center;"></vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-listado-de-compras-enviadas';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaListadoDeComprasEnviadas.is, VistaListadoDeComprasEnviadas);
