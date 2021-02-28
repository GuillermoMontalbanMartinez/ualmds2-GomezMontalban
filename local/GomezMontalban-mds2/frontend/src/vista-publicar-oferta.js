import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-publicar-oferta`
 *
 * VistaPublicarOferta element.
 *
 * @customElement
 * @polymer
 */
class VistaPublicarOferta extends PolymerElement {

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
        return 'vista-publicar-oferta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPublicarOferta.is, VistaPublicarOferta);
