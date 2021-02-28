import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-eliminar-oferta`
 *
 * VistaEliminarOferta element.
 *
 * @customElement
 * @polymer
 */
class VistaEliminarOferta extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-eliminar-oferta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEliminarOferta.is, VistaEliminarOferta);
